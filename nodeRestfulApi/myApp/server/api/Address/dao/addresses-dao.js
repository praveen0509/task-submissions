import Promise from 'bluebird';
import models from '../../../models';


export default class addressesDao {

  static getAll(_body) {
    return new Promise((resolve, reject) => {
      models.Address.findAll().then().catch();
    });
  }


  static createNew(_body) {
      console.log(_body);
      return new Promise((resolve,reject) => {
        models.Address.create(
          {
            id: _body.id,
            city: _body.city,
            state: _body.state
          }
        )
      }).then(() => {res.send(200)}).catch();
  }


  static updateRow(_body, _id) {
    console.log(_body,_id);
    return new Promise((resolve, response) => {
      models.Address.update({state: _body.state },
                            { where : { id: _id}})
    }).then(() => res.send(200)).catch(() => res.send(400));
  }


  static deleteRow(_id) {
     console.log(_id);
     return new Promise((resolve, reject) => {
       models.Address.destroy({
         where : {id : _id}
       })
     }).then().catch();
  }

}




