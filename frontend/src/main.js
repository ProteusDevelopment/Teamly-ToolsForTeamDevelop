import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import i18n from './i18n'

Vue.config.productionTip = false

Vue.locale = 'ru'
Vue.locales = {
  'Login': {
    'ru': 'Войти'
  },
  'Register': {
    'ru': 'Регистрация'
  },
  'Please login': {
    'ru': 'Пожалуйста, войдите'
  },
  'Email address': {
    'ru': 'Адрес эл. почты'
  }
}

Vue.prototype.$tr = (str) => {
  try {
    return Vue.locales[str][Vue.locale]
  }
  catch (exception) {
    console.log('"' + str + '" not translated for "' + Vue.locale + '"')
  }
  return str
}

new Vue({
  router,
  store,
  // i18n,
  render: h => h(App)
}).$mount('#app')
