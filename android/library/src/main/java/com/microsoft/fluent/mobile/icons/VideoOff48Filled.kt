package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.VideoOff48: ImageVector
  get() {
    if (_videoOff48 != null) {
      return _videoOff48!!
    }
    _videoOff48 = fluentIcon(name = "Filled.VideoOff48", 48f) {
      materialPath {
          moveTo(30.929F, 32.697F)
          lineToRelative(10.937F, 10.937F)
          curveToRelative(0.488F, 0.488F, 1.28F, 0.488F, 1.768F, 0.0F)
          reflectiveCurveToRelative(0.488F, -1.28F, 0.0F, -1.768F)
          lineToRelative(-37.5F, -37.5F)
          curveToRelative(-0.488F, -0.488F, -1.28F, -0.488F, -1.768F, 0.0F)
          reflectiveCurveToRelative(-0.488F, 1.28F, 0.0F, 1.768F)
          lineToRelative(4.119F, 4.119F)
          curveTo(5.893F, 11.014F, 4.0F, 13.41F, 4.0F, 16.25F)
          verticalLineToRelative(15.5F)
          curveTo(4.0F, 35.202F, 6.798F, 38.0F, 10.25F, 38.0F)
          horizontalLineToRelative(14.5F)
          curveToRelative(3.13F, 0.0F, 5.723F, -2.3F, 6.179F, -5.303F)
          close()
          moveToRelative(13.075F, 0.046F)
          curveToRelative(0.0F, 1.973F, -1.667F, 3.335F, -3.411F, 3.252F)
          lineTo(33.0F, 28.403F)
          verticalLineTo(16.66F)
          lineToRelative(5.907F, -4.079F)
          curveToRelative(2.156F, -1.488F, 5.097F, 0.055F, 5.097F, 2.675F)
          verticalLineToRelative(17.487F)
          close()
          moveTo(31.0F, 16.25F)
          verticalLineToRelative(10.153F)
          lineTo(14.597F, 10.0F)
          horizontalLineTo(24.75F)
          curveToRelative(3.452F, 0.0F, 6.25F, 2.798F, 6.25F, 6.25F)
          close()        
      }
    }
    return _videoOff48!!
  }

private var _videoOff48: ImageVector? = null
