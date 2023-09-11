import request from '@/utils/request'

// 查询xhs列表
export function listRecommend(query) {
  return request({
    url: '/spider/recommend/list',
    method: 'get',
    params: query
  })
}

// 查询xhs详细
export function getRecommend(id) {
  return request({
    url: '/spider/recommend/' + id,
    method: 'get'
  })
}

// 新增xhs
export function addRecommend(data) {
  return request({
    url: '/spider/recommend',
    method: 'post',
    data: data
  })
}

// 修改xhs
export function updateRecommend(data) {
  return request({
    url: '/spider/recommend',
    method: 'put',
    data: data
  })
}

// 删除xhs
export function delRecommend(id) {
  return request({
    url: '/spider/recommend/' + id,
    method: 'delete'
  })
}
