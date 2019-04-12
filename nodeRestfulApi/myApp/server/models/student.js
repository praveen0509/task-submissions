'use strict';
module.exports = (sequelize, DataTypes) => {
  const Student = sequelize.define('Student', {
    stdName: DataTypes.STRING,
    marks: DataTypes.INTEGER,
    dob: DataTypes.INTEGER,
    addId: DataTypes.INTEGER
  }, {});
  Student.associate = function(models) {
    // associations can be defined here
      Student.hasMany(models.Address, {
        foreignKey: 'id',
        sourceKey: 'addId'
      })

  };
  return Student;
};
