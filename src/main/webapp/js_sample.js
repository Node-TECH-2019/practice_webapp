function handleClick() {

  var message = document.my_form.text.value;
  alert(message);

}

function getAge() {
  var birthyear = parseInt(document.my_form.year.value);
  var birthmonth = parseInt(document.my_form.month.value);
  var birthday = parseInt(document.my_form.day.value);
  var age = 0;
  var now = new Date();
  var nowYear = now.getYear();
  var nowMonth = now.getMonth() + 1;
  var nowDay = now.getDate();
  if (nowYear < 1900) { nowYear = nowYear + 1900; }
  if (nowMonth < birthmonth) { age = nowYear - birthyear - 1; }
  else if (nowMonth > birthmonth) { age = nowYear - birthyear; }
  else {
    if (nowDay < birthday) { age = nowYear - birthyear - 1; }
    else { age = nowYear - birthyear; }
  }
  document.my_form.age.value = age.toString();
}
