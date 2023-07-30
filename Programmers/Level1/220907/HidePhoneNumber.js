export default function solution(phoneNumber) {
  const answer = {
    phoneNumber: '',
  };

  for (let i = 0; i < phoneNumber.length - 4; i += 1) {
    answer.phoneNumber += '*';
  }

  answer.phoneNumber += phoneNumber.substring(phoneNumber.length - 4, phoneNumber.length);

  return answer.phoneNumber;
}
