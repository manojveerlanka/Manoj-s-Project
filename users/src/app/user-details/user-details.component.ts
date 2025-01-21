import { Component, OnInit } from '@angular/core';
import { user } from './usersModel';
import { UsersService } from './users.service';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-user-details',
  imports: [CommonModule],
  standalone: true,
  templateUrl: './user-details.component.html',
  styleUrl: './user-details.component.css',
})
export class UserDetailsComponent implements OnInit {
  userLists: user[] = [];

  constructor(private userService: UsersService) {}
  ngOnInit() {
    this.userService.getUsers().subscribe((data: any) => {
      this.userLists = data;
    });
  }
}
