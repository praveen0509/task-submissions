import Promise from 'bluebird';
import apiUtils from "~/server/api/utils/ApiUtils";
import models from "~/server/models";
import * as _ from "lodash";

export default class HospitalsDao{
   

    static getById(id){
        return new Promise((resolve,reject)=>{
            models.hospital
                .find({where:{provider_id:id}})
                .then(hospital=>{
                    resolve(hospital)
                },(error)=>{
                    reject(error)
                })
        })
    }
}

