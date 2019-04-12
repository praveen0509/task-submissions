'use strict';
module.exports = {
  up: (queryInterface, Sequelize) => {
    return queryInterface.createTable('Students', {
      id: {
        allowNull: false,
        autoIncrement: true,
        primaryKey: true,
        type: Sequelize.INTEGER
      },
      stdName: {
        type: Sequelize.STRING
      },
      marks: {
        type: Sequelize.INTEGER
      },
      dob: {
        type: Sequelize.INTEGER
      },
      createdAt: {
        allowNull: false,
        type: Sequelize.DATE
      },
      updatedAt: {
        allowNull: false,
        type: Sequelize.DATE
      },
      addId: {
        type: Sequelize.INTEGER,
        references: {
          model: 'Addresses',
          key: 'id'
        },
        onDelete: 'CASCADE'
      }
    });
  },
  down: (queryInterface, Sequelize) => {
    return queryInterface.dropTable('Students');
  }
};
