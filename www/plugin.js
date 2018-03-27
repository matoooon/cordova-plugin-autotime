
var exec = require('cordova/exec');

var PLUGIN_NAME = 'AutoTimePlugin';

var AutoTimePlugin = {
  getAutoTime: function(cb) {
    exec(cb, null, PLUGIN_NAME, 'autotime');
  },
  getAutoTimeZone: function() {
    exec(cb, null, PLUGIN_NAME, 'autotimezone');
  }
};

module.exports = AutoTimePlugin;
