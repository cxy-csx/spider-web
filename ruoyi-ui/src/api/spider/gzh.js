import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listGzh(query) {
  return request({
    url: '/spider/gzh/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getGzh(id) {
  return request({
    url: '/spider/gzh/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addGzh(data) {
  return request({
    url: '/spider/gzh',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateGzh(data) {
  return request({
    url: '/spider/gzh',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delGzh(id) {
  return request({
    url: '/spider/gzh/' + id,
    method: 'delete'
  })
}
