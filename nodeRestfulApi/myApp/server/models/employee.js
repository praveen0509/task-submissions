'use strict';
module.exports = (sequelize, DataTypes) => {
  const Employee = sequelize.define('Employee', {
    empName: DataTypes.STRING
  }, {});
  Employee.associate = function(models) {
    // associations can be defined here
    Employee.belongsTo(models.Department, {
      foreignKey: 'id',
      targetKey: 'employeeId'
    });
  };
  return Employee;
};











