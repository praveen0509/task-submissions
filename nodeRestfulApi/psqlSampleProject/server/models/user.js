'use strict';
module.exports = (sequelize, DataTypes) => {
  const User = sequelize.define('User', {
    username: DataTypes.STRING
  }, {});
  User.associate = function(models) {
    // associations can be defined here
    User.belongsTo(models.UserListing, {
      foreignKey : 'id',
      targetKey: 'userId'
    });
  };
  return User;
};
