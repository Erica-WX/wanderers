import Vue from 'vue'
import Router from 'vue-router'
import Login from './views/Login.vue'
import SignUp from "./views/SignUp";
import Index from './views/Index.vue'
import Stream from './views/Stream.vue'
import Library from './views/Library.vue'
import Home from './views/Home.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      component: Index,
      redirect: '/index'
    },
    {
      path: '/signUp',
      component: SignUp
    },
    {
      path: '/login',
      component: Login
    },
    {
      path: '/index',
      component: Index,
      children:[
        {
          path: 'stream',
          component: Stream
        },
        {
          path: 'library',
          component: Library
        },
        {
          path: 'home',
          component: Home
        }
      ]
    }
  ]
})
