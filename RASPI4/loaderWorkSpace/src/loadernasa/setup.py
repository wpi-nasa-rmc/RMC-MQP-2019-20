from setuptools import setup
import os
from glob import glob

package_name = 'loadernasa'

setup(
    name=package_name,
    version='0.0.0',
    packages=[package_name],
    data_files=[
        ('share/ament_index/resource_index/packages',
            ['resource/' + package_name]),
        ('share/' + package_name, ['package.xml']),
	('share/'+ package_name, ['launch/rmc_config.launch.py']),
    ],
    install_requires=['setuptools'],
    zip_safe=True,
    maintainer='nasarmc',
    maintainer_email='wpinasarmc@gmail.com',
    description='Loader package of nodes',
    license='TODO: License declaration',
    tests_require=['pytest'],
    entry_points={
        'console_scripts': [
            'talker = loadernasa.publisher_member_function:main',
            'listener = loadernasa.subscriber_member_function:main',
            'service = loadernasa.service_member_function:main',
            'client = loadernasa.client_member_function:main',
	    'jetsonSevice = loadernasa.jetsonService:main',
	    'heroPi4Client = loadernasa.heroPi4Client:main',
	    'heroPi4Pub = loadernasa.heroPi4Pub:main',
	    'imuService = loadernasa.imuService:main',
	    'odriveCmdClient = loadernasa.odriveCmdClient:main',
	    'odriveEncoderPub = loadernasa.odriveEncoderPub:main',
	    'pi4CameraClient = loadernasa.pi4CameraClient:main',
	    'pi4HeroService = loadernasa.pi4HeroService:main',
	    'pi4HeroSub = loader.pi4HeroSub:main',
	    'pi4ImuClient = loadernasa.pi4ImuClient:main',
	    'pi4OdriveCmdService = loadernasa.pi4OdriveCmdService:main',
	    'pi4OdriveSub = loadernasa.pi4OdriveSub:main'
        ],
    },
)
