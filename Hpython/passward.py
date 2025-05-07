import subprocess

command = subprocess.check_output(['netsh', 'wlan', 'show', 'profiles']).decode()
profiles = [i.split(":")[1][1:-1] for i in command.split('\n') if "All User Profile" in i]

for i in profiles:
    results = subprocess.check_output(['netsh', 'wlan', 'show', 'profile', i, 'key=clear']).decode()
    results = [b.split(":")[1][1:-1] for b in results.split('\n') if "Key Content" in b]
    try:
        print("{:<30}| {:<}".format(i, results[0]))
    except IndexError:
        print("{:<30}| {:<}".format(i, ""))
input("")