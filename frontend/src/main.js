import Vue from 'vue'
import './plugins/axios'
import App from './App.vue'
import router from './router'
import store from './store'
import './plugins/element.js'

Vue.config.productionTip = false
Vue.prototype.global = {
  server: 'http://localhost:8888/',
  // userInfo: {}
}

/* 请求拦截器 */
Vue.axios.interceptors.request.use(config =>{
  if(localStorage.JWT){
    config.headers.authorization = 'Bearer '+localStorage.JWT
  }else{
    config.headers.authorization = 'dummy'
  }
  return config
},error=>{
  return Promise.reject(error.request)
})

/* 响应拦截器 */
Vue.axios.interceptors.response.use(res=>{
  //存储token
  localStorage.JWT = res.headers.authorization
  return res
},error=>{
  if(error.request.responseURL.indexOf('/signIn')>0){
    return Promise.reject(error)
  }else if(error.response.status == 401 || error.response.status == 403){
    alert("你没有权限，请重新登录")
    localStorage.JWT = undefined
    this.$router.push({path:'/login'})
  }else{
    alert('服务器内部错误')
  }
})
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
