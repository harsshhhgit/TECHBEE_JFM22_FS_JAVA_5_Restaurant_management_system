import { Component, OnInit } from '@angular/core';
import Typed from 'typed.js';
import {NgForm} from '@angular/forms';
import {RouterModule} from '@angular/router';
import { FeedbackService } from '../services/feedback.service';
@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  ngOnInit(): void {
    // typing animation script
    var typed = new Typed(".typing",{
      strings: ["Fast food", "Protein rich foods", "Baked Food"],
      typeSpeed: 100,
      backSpeed: 60,
      loop: true
  });

  var typed = new Typed(".typing-2",{
      strings: ["Fast food", "Protein rich foods", "Baked Food"],
      typeSpeed: 100,
      backSpeed: 60,
      loop: true
  });
  }

  feedbackDetails = null as any;
  
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
    )
  }

}

