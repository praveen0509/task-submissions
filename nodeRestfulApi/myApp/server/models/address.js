'use strict';
module.exports = (sequelize, DataTypes) => {
  const Address = sequelize.define('Address', {
    city: DataTypes.STRING,
    state: DataTypes.STRING
  }, {});
  Address.associate = function(models) {
    // associations can be defined here
    Address.belongsTo(models.Student, {
      foreignKey: 'id',
      targetKey: 'addId'
    })
  };
  return Address;
};
