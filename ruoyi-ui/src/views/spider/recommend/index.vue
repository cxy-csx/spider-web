<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="笔记id" prop="noteId">
        <el-input
          v-model="queryParams.noteId"
          placeholder="请输入笔记id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="笔记封面" prop="noteCover">-->
<!--        <el-input-->
<!--          v-model="queryParams.noteCover"-->
<!--          placeholder="请输入笔记封面"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item label="标题" prop="noteTitle">
        <el-input
          v-model="queryParams.noteTitle"
          placeholder="请输入笔记标题"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="发布用户" prop="noteUserId">-->
<!--        <el-input-->
<!--          v-model="queryParams.noteUserId"-->
<!--          placeholder="请输入发布用户"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item label="用户昵称" prop="noteUserNickname">
        <el-input
          v-model="queryParams.noteUserNickname"
          placeholder="请输入发布用户昵称"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="发布用户头像" prop="noteUserAvatar">-->
<!--        <el-input-->
<!--          v-model="queryParams.noteUserAvatar"-->
<!--          placeholder="请输入发布用户头像"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item label="喜欢数" prop="noteLikeCount">
        <el-input
          v-model="queryParams.noteLikeCount"
          placeholder="请输入笔记喜欢数"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="primary"-->
<!--          plain-->
<!--          icon="el-icon-plus"-->
<!--          size="mini"-->
<!--          @click="handleAdd"-->
<!--          v-hasPermi="['spider:recommend:add']"-->
<!--        >新增</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="success"-->
<!--          plain-->
<!--          icon="el-icon-edit"-->
<!--          size="mini"-->
<!--          :disabled="single"-->
<!--          @click="handleUpdate"-->
<!--          v-hasPermi="['spider:recommend:edit']"-->
<!--        >修改</el-button>-->
<!--      </el-col>-->
<!--      <el-col :span="1.5">-->
<!--        <el-button-->
<!--          type="danger"-->
<!--          plain-->
<!--          icon="el-icon-delete"-->
<!--          size="mini"-->
<!--          :disabled="multiple"-->
<!--          @click="handleDelete"-->
<!--          v-hasPermi="['spider:recommend:remove']"-->
<!--        >删除</el-button>-->
<!--      </el-col>-->
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['spider:recommend:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="recommendList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="自增主键" align="center" prop="id" />-->
      <el-table-column label="id" align="center" prop="noteId" />
      <el-table-column label="封面" align="center" prop="noteCover" >
        <template slot-scope="scope">
            <el-image
              style="height: 50px"
              :src="scope.row.noteCover"
              ></el-image>
        </template>
      </el-table-column>
      <el-table-column label="标题" align="center" prop="noteTitle" />
<!--      <el-table-column label="发布用户" align="center" prop="noteUserId" />-->
      <el-table-column label="用户昵称" align="center" prop="noteUserNickname" />
      <el-table-column label="用户头像" align="center" prop="noteUserAvatar" >
        <template slot-scope="scope">
          <el-image
            style="width: 50px; height: 50px"
            :src="scope.row.noteUserAvatar"
          ></el-image>
        </template>
      </el-table-column>
      <el-table-column label="喜欢数" align="center" prop="noteLikeCount" />
<!--      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">-->
<!--        <template slot-scope="scope">-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-edit"-->
<!--            @click="handleUpdate(scope.row)"-->
<!--            v-hasPermi="['spider:recommend:edit']"-->
<!--          >修改</el-button>-->
<!--          <el-button-->
<!--            size="mini"-->
<!--            type="text"-->
<!--            icon="el-icon-delete"-->
<!--            @click="handleDelete(scope.row)"-->
<!--            v-hasPermi="['spider:recommend:remove']"-->
<!--          >删除</el-button>-->
<!--        </template>-->
<!--      </el-table-column>-->
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改xhs对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="笔记id" prop="noteId">
          <el-input v-model="form.noteId" placeholder="请输入笔记id" />
        </el-form-item>
        <el-form-item label="笔记封面" prop="noteCover">
          <el-input v-model="form.noteCover" placeholder="请输入笔记封面" />
        </el-form-item>
        <el-form-item label="笔记标题" prop="noteTitle">
          <el-input v-model="form.noteTitle" placeholder="请输入笔记标题" />
        </el-form-item>
        <el-form-item label="发布用户" prop="noteUserId">
          <el-input v-model="form.noteUserId" placeholder="请输入发布用户" />
        </el-form-item>
        <el-form-item label="发布用户昵称" prop="noteUserNickname">
          <el-input v-model="form.noteUserNickname" placeholder="请输入发布用户昵称" />
        </el-form-item>
        <el-form-item label="发布用户头像" prop="noteUserAvatar">
          <el-input v-model="form.noteUserAvatar" placeholder="请输入发布用户头像" />
        </el-form-item>
        <el-form-item label="笔记喜欢数" prop="noteLikeCount">
          <el-input v-model="form.noteLikeCount" placeholder="请输入笔记喜欢数" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listRecommend, getRecommend, delRecommend, addRecommend, updateRecommend } from "@/api/spider/recommend";

export default {
  name: "Recommend",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // xhs表格数据
      recommendList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        noteId: null,
        noteCover: null,
        noteTitle: null,
        noteUserId: null,
        noteUserNickname: null,
        noteUserAvatar: null,
        noteLikeCount: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询xhs列表 */
    getList() {
      this.loading = true;
      listRecommend(this.queryParams).then(response => {
        this.recommendList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        noteId: null,
        noteCover: null,
        noteTitle: null,
        noteUserId: null,
        noteUserNickname: null,
        noteUserAvatar: null,
        noteLikeCount: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加xhs";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getRecommend(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改xhs";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateRecommend(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addRecommend(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除xhs编号为"' + ids + '"的数据项？').then(function() {
        return delRecommend(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('spider/recommend/export', {
        ...this.queryParams
      }, `recommend_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
