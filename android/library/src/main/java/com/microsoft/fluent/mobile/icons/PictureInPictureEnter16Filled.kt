package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PictureInPictureEnter16: ImageVector
  get() {
    if (_pictureInPictureEnter16 != null) {
      return _pictureInPictureEnter16!!
    }
    _pictureInPictureEnter16 = fluentIcon(name = "Filled.PictureInPictureEnter16", 16f) {
      materialPath {
          moveTo(3.5F, 2.0F)
          curveTo(2.12F, 2.0F, 1.0F, 3.12F, 1.0F, 4.5F)
          verticalLineToRelative(5.0F)
          curveTo(1.0F, 10.88F, 2.12F, 12.0F, 3.5F, 12.0F)
          horizontalLineTo(7.0F)
          verticalLineToRelative(-2.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(5.0F)
          verticalLineTo(4.5F)
          curveTo(14.0F, 3.12F, 12.88F, 2.0F, 11.5F, 2.0F)
          horizontalLineToRelative(-8.0F)
          close()
          moveToRelative(0.147F, 2.646F)
          curveToRelative(0.195F, -0.195F, 0.511F, -0.195F, 0.707F, 0.0F)
          lineTo(6.0F, 6.293F)
          verticalLineTo(5.5F)
          curveTo(6.0F, 5.224F, 6.224F, 5.0F, 6.5F, 5.0F)
          reflectiveCurveTo(7.0F, 5.224F, 7.0F, 5.5F)
          verticalLineToRelative(2.0F)
          curveTo(7.0F, 7.776F, 6.776F, 8.0F, 6.5F, 8.0F)
          horizontalLineToRelative(-2.0F)
          curveTo(4.224F, 8.0F, 4.0F, 7.776F, 4.0F, 7.5F)
          reflectiveCurveTo(4.224F, 7.0F, 4.5F, 7.0F)
          horizontalLineToRelative(0.793F)
          lineTo(3.646F, 5.354F)
          curveToRelative(-0.195F, -0.196F, -0.195F, -0.512F, 0.0F, -0.708F)
          close()
          moveTo(8.0F, 10.0F)
          curveToRelative(0.0F, -0.552F, 0.448F, -1.0F, 1.0F, -1.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, 0.448F, 1.0F, 1.0F)
          verticalLineToRelative(3.0F)
          curveToRelative(0.0F, 0.552F, -0.448F, 1.0F, -1.0F, 1.0F)
          horizontalLineTo(9.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, -0.448F, -1.0F, -1.0F)
          verticalLineToRelative(-3.0F)
          close()        
      }
    }
    return _pictureInPictureEnter16!!
  }

private var _pictureInPictureEnter16: ImageVector? = null
