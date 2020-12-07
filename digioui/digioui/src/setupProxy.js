const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(App) {
  App.use(
    ['/demo/allTeacher','/demo/allStudent'],
    createProxyMiddleware({
      target: 'http://localhost:7777',
      changeOrigin: true,
      
    })
  );
};