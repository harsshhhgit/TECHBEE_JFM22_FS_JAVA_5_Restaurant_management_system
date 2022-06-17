import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FeedbackService } from '../../services/feedback.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  feedbackDetails = null as any;

  ngOnInit(): void {
  }

  constructor(private feedbackService:FeedbackService) {
    this.getFeedbacksDetails();
  }

  onSubmit(feedbackAddForm: NgForm){

    this.feedbackService.registerFeedback(feedbackAddForm.value).subscribe(
      // {
      // next: (v) => console.log(v),
      // error: (e) => console.error(e),
      // complete: () => console.info('complete')

      {
        next : (resp)=>{
          console.log(resp);
          feedbackAddForm.reset();
          this.getFeedbacksDetails();
  
        },
        error : (err)=>{
          console.log(err);
        }
      }

  // }
  )
  }

  getFeedbacksDetails(){
    this.feedbackService.getFeedbacks().subscribe(
      {
        next : (resp) => {
          console.log(resp);
          this.feedbackDetails=resp;
        },
        error : (err) => {
          console.log(err);
        }
      }
      //   {
      //   next: (h) => console.log(h),
      //   error: (g) => console.error(g),
      //   complete: () => console.info('Fetched')
      // }
    )
  }

}
