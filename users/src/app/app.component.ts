import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserDetailsComponent } from './user-details/user-details.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [UserDetailsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css',
})
export class AppComponent {
  title = 'User Details';
  description = 'To show demographical details of users from FakeAPI';
}
