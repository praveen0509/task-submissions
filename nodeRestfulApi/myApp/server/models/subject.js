'use strict';
module.exports = (sequelize, DataTypes) => {
  const Subject = sequelize.define('Subject', {
    subName: DataTypes.STRING
  }, {});
  Subject.associate = function(models) {
    // associations can be defined here
    Subject.belongsToMany(models.Lecturer, {
      through: 'lecturers_subjects',
      foreignKey: 'lectId'
    })


  };
  return Subject;
};
