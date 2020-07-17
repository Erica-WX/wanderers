import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    musicSrc: '',
    music:{
      mscID: '',
      mscName: '',
      mscSrc: '',
      mscListens: '',
    }

  },

  mutations: {
    setMusicSrc(state,path){
      alert(path)
      state.musicSrc = path;
      console.log("set path:"+path+"success");
    },
    setCurrentMusic(state,res){
      state.music.mscId=res.mscID;
      state.music.mscName=res.mscName;
      state.music.mscSrc=res.mscSrc;
      state.music.mscListens=res.mscListens;
      console.log(state.music.mscName)
    }
  },
  actions: {

  }
})
