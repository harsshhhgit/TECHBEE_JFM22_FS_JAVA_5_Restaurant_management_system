import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {

  constructor(private http: HttpClient) { }

  API = "http://localhost:8090"
  public registerFeedback(feedbackData: any){
    return this.http.post(this.API+ '/registerFeedback' , feedbackData);
  }

  public getFeedbacks(){
    return this.http.get(this.API + '/getFeedbacks')
  }


}
