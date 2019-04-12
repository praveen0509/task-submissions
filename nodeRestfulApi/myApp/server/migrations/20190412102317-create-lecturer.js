'use strict';
module.exports = {
  up: (queryInterface, Sequelize) => {
    return queryInterface.createTable('Lecturers', {
      id: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER
      },
      lectName: {
        type: Sequelize.STRING
      },
      createdAt: {
        allowNull: false,
        type: Sequelize.DATE
      },
      updatedAt: {
        allowNull: false,
        type: Sequelize.DATE
      },
      subjectId: {
        type: Sequelize.INTEGER,
        references: {
          models: 'Student',

        }
      }

    });
  },
  down: (queryInterface, Sequelize) => {
    return queryInterface.dropTable('Lecturers');
  }
};























