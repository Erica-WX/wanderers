<template>
  <el-container>
    <el-alert v-if="signFlag" type="success">您已经登录过了，{{ jumpSeconds }}后返回上一界面..</el-alert>
    <el-header style="margin-bottom:100px">
      <el-row type="flex" class="row-bg" justify="center">
        <el-col :span="6">
          <H2>注册</H2>
        </el-col>
      </el-row>
    </el-header>
    <el-row type="flex" class="row" justify="center">
      <el-col :span="8" :offset="0">
        <el-form ref="loginForm" :rules="rules" style="..."
                 :label-position="'right'" :model="userInfo">
          <el-form-item>
            <label class="label">用户名</label>
            <el-input placeholder="输入用户名" auto-complete="new-password" v-model="username">
              <template slot="prepend">
                用户名
              </template>
            </el-input>
          </el-form-item>
          <el-form-item>
            <label class="label">密码</label>
            <el-input placeholder="输入密码" type="password" auto-complete="new-password" v-model="password">
              <template slot="prepend">
                &nbsp密码&nbsp&nbsp
              </template>
            </el-input>
          </el-form-item>
          <el-form-item>
            <label class="label">再次输入密码</label>
            <el-input placeholder="再次输入密码" type="password" auto-complete="repeat-password" v-model="password">
            </el-input>
          </el-form-item>
        </el-form>
        <el-row>
          <el-col :span="4" :offset="10">
            <el-button type="primary" @click="submit">
              注册
            </el-button>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </el-container>
</template>

<script>
    export default {
        name: "SignUp",
        data(){
            return {
                jumpSeconds: 2,

                signUpForm:{
                    username: '',
                    password: '',
                    role:1,
                    avatarUrl:'null',
                    introduction:'null',
                    follower:0,
                    del_flag:0,
                    band:{
                        bid:1,
                    }
                }

                // signFlag: false
            }
        },
        methods: {
            submit: function () {
                // todo 1.获取input框的数据 2.通过axios提交数据
                let username = this.username;
                let password = this.password;
                let role = this.role;
                let avatarUrl = this.avatarUrl;
                let introduction = this.introduction;
                let follower = this.follower;
                let del_flag = this.del_flag;
                let band = this.band;
                axios.post('/signUp', {username, password,role,avatarUrl,introduction,follower,del_flag,band}).then(res => {
                    console.log(res) //打印返回内容
                    this.$router.push({path: '/Login'})
                }).catch(()=>{
                    this.signFlag = true
                    alert("SignUp failed")
                })
            }
        }
    }
</script>

<style scoped>

</style>
