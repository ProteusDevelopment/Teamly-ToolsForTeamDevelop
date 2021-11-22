module.exports = {
    outputDir: 'build',

    pluginOptions: {
      i18n: {
        locale: 'en',
        fallbackLocale: 'en',
        localeDir: 'locales',
        enableInSFC: false,
        enableBridge: false
      }
    },

    devServer: {
        port: 3000,
        proxy: {
            '/api': {
                target: 'http://localhost:8080/api',
                ws: true,
                changeOrigin: true
            }
        }
    }
};
