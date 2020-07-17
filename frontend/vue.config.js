/**
 * Created by Joe on 2019/4/9.
 */
module.exports = {
  devServer: {

    proxy: {
      '/music':{
        target: 'http://localhost:8888',
        changeOrigin: true
      },
      '/':{
        ws: false,
        target: 'http://localhost:8888',
        changeOrigin: true
      }
    }
  }
}
