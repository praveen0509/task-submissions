import Promise from 'bluebird';
import models from '../../../models';


export default class studentsDao {

  static getAll(_body) {
    return new Promise((resolve, reject) => {
      models.Student.findAll({
        include: [{}]
      }).then().catch();
    });
  }


  static createNew(_body) {
    console.log(_body);
    return new Promise((resolve,reject) => {
      models.Student.create(
        {
          id: _body.id,
          stdName: _body.stdName,
          marks: _body.marks,
          dob: _body.dob,
          addId: _body.addId
        }
      )
    }).then(() => {res.status(200)}).catch();
  }


  static updateRow(_body, _id) {
    console.log(_body,_id);
    return new Promise((resolve, response) => {
      models.Student.update({stdName: _body.stdName },
        { where : { id: _id}})
    }).then(() => res.send(200)).catch(() => res.send(400));
  }


  static deleteRow(_id) {
    console.log(_id);
    return new Promise((resolve, reject) => {
      models.Student.destroy({
        where : {id : _id}
      })
    }).then().catch();
  }

}


