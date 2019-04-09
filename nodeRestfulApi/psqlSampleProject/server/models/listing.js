'use strict';
module.exports = (sequelize, DataTypes) => {
  const Listing = sequelize.define('Listing', {
    title: DataTypes.STRING,
    description: DataTypes.TEXT
  }, {});
  Listing.associate = function(models) {
    // associations can be defined here
    Listing.belongsTo(models.UserListing, {
      foreignKey : 'id',
      targetKey: 'listingId'
    });
  };
  return Listing;
};
