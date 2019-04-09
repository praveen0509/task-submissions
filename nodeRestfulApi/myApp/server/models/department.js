'use strict';
module.exports = (sequelize, DataTypes) => {
  const Department = sequelize.define('Department', {
    deptName: DataTypes.STRING,
    employeeId: DataTypes.INTEGER
  }, {});
  Department.associate = function(models) {
    // associations can be defined here
    Department.hasMany(models.Employee, {
      foreignKey: 'id',
      sourceKey: 'employeeId'
    });

  };
  return Department;
};
