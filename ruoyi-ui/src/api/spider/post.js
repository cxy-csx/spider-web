import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listPost(query) {
  return request({
    url: '/spider/post/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getPost(id) {
  return request({
    url: '/spider/post/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addPost(data) {
  return request({
    url: '/spider/post',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updatePost(data) {
  return request({
    url: '/spider/post',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delPost(id) {
  return request({
    url: '/spider/post/' + id,
    method: 'delete'
  })
}
