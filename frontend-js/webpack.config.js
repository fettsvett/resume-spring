var packageJSON = require('./package.json');
var path = require('path');
var webpack = require('webpack');

const PATHS = {
  build: path.join(__dirname, 'target', 'classes', 'META-INF', 'resources', 'webjars', packageJSON.name, packageJSON.version)
};

module.exports = {
  entry: './js/index.js',

  output: {
    path: PATHS.build,
    publicPath: '/assets/',
    filename: 'main.js'
  }
};