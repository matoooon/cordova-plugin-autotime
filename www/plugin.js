
var exec = require('cordova/exec');

var PLUGIN_NAME = 'AutoTimePlugin';

var AutoTimePlugin = {
  echo: function(phrase, cb) {
    exec(cb, null, PLUGIN_NAME, 'echo', [phrase]);
  },
  getDate: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'getDate', []);
  },
  getAutoTime: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'autotime', []);
  }
};

module.exports = AutoTimePlugin;
