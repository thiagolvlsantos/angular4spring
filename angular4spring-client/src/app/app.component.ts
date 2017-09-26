import { Component } from '@angular/core';
import { Http } from '@angular/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  location: string
  result: { id: number, msg: string }

  constructor(private http: Http) { }

  send() {
    if (location) {
      this.http.get("http://localhost:8080/echo?msg=" + this.location).subscribe((res) => {
        console.log(res);
        this.result = res.json()
      })
    }
  }
}
