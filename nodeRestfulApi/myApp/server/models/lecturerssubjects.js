'use strict';
module.exports = (sequelize, DataTypes) => {
  const lecturersSubjects = sequelize.define('lecturersSubjects', {
    lecturerId: DataTypes.INTEGER,
    subjectId: DataTypes.INTEGER
  }, {});
  lecturersSubjects.associate = function(models) {
    // associations can be defined here

  };
  return lecturersSubjects;
};
