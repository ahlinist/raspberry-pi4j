import requests
import urllib.request
import os


build_info_url = 'https://circleci.com/api/v1.1/project/github/ahlinist/raspberry-pi4j/latest/artifacts'
build_info = requests.get(url=build_info_url)
build_info_json = build_info.json()
artifact_url = build_info_json[0].get('url')
urllib.request.urlretrieve(artifact_url, 'robo.jar')
os.system('java -jar robo.jar')
