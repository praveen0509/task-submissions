'use strict';
module.exports = (sequelize, DataTypes) => {
  const Lecturer = sequelize.define('Lecturer', {
    lectName: DataTypes.STRING
  }, {});
  Lecturer.associate = function(models) {
    // associations can be defined here
    Lecturer.belongsToMany(models.Subject, {
      through: 'lecturersSubjects',
      foreignKey: 'lecturerId'
    })

  };
  return Lecturer;
};
