package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PaintBucket20: ImageVector
  get() {
    if (_paintBucket20 != null) {
      return _paintBucket20!!
    }
    _paintBucket20 = fluentIcon(name = "Filled.PaintBucket20", 20f) {
      materialPath {
          moveTo(9.0F, 2.5F)
          curveTo(9.0F, 2.224F, 8.776F, 2.0F, 8.5F, 2.0F)
          reflectiveCurveTo(8.0F, 2.224F, 8.0F, 2.5F)
          verticalLineTo(4.0F)
          curveTo(7.795F, 4.072F, 7.603F, 4.19F, 7.44F, 4.354F)
          lineTo(2.352F, 9.439F)
          curveToRelative(-0.585F, 0.586F, -0.585F, 1.536F, 0.0F, 2.122F)
          lineToRelative(4.336F, 4.335F)
          curveToRelative(0.586F, 0.586F, 1.536F, 0.586F, 2.122F, 0.0F)
          lineToRelative(5.085F, -5.085F)
          curveToRelative(0.586F, -0.586F, 0.586F, -1.536F, 0.0F, -2.122F)
          lineTo(9.561F, 4.354F)
          curveTo(9.397F, 4.19F, 9.205F, 4.072F, 9.0F, 4.0F)
          verticalLineTo(2.5F)
          close()
          moveToRelative(4.269F, 7.5F)
          horizontalLineTo(3.207F)
          lineTo(8.0F, 5.207F)
          verticalLineTo(6.5F)
          curveTo(8.0F, 6.776F, 8.224F, 7.0F, 8.5F, 7.0F)
          reflectiveCurveTo(9.0F, 6.776F, 9.0F, 6.5F)
          verticalLineTo(5.207F)
          lineToRelative(4.19F, 4.19F)
          curveTo(13.352F, 9.56F, 13.38F, 9.808F, 13.268F, 10.0F)
          close()
          moveToRelative(2.747F, 1.392F)
          curveToRelative(-0.23F, -0.395F, -0.801F, -0.395F, -1.032F, 0.0F)
          lineToRelative(-1.652F, 2.833F)
          curveTo(12.355F, 15.898F, 13.562F, 18.0F, 15.5F, 18.0F)
          curveToRelative(1.937F, 0.0F, 3.145F, -2.102F, 2.168F, -3.775F)
          lineToRelative(-1.652F, -2.833F)
          close()        
      }
    }
    return _paintBucket20!!
  }

private var _paintBucket20: ImageVector? = null
