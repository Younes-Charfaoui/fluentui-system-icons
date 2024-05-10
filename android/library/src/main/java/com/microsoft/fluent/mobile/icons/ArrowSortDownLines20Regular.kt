package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ArrowSortDownLines20: ImageVector
  get() {
    if (_arrowSortDownLines20 != null) {
      return _arrowSortDownLines20!!
    }
    _arrowSortDownLines20 = fluentIcon(name = "Regular.ArrowSortDownLines20", 20f) {
      materialPath {
          moveTo(15.0F, 2.5F)
          curveTo(15.0F, 2.224F, 14.776F, 2.0F, 14.5F, 2.0F)
          reflectiveCurveTo(14.0F, 2.224F, 14.0F, 2.5F)
          verticalLineToRelative(13.793F)
          lineToRelative(-2.146F, -2.147F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          curveToRelative(-0.195F, 0.196F, -0.195F, 0.512F, 0.0F, 0.708F)
          lineToRelative(3.0F, 3.0F)
          curveToRelative(0.196F, 0.195F, 0.512F, 0.195F, 0.708F, 0.0F)
          lineToRelative(3.0F, -3.0F)
          curveToRelative(0.195F, -0.196F, 0.195F, -0.512F, 0.0F, -0.708F)
          curveToRelative(-0.196F, -0.195F, -0.512F, -0.195F, -0.708F, 0.0F)
          lineTo(15.0F, 16.293F)
          verticalLineTo(2.5F)
          close()
          moveTo(2.5F, 4.0F)
          curveTo(2.224F, 4.0F, 2.0F, 4.224F, 2.0F, 4.5F)
          reflectiveCurveTo(2.224F, 5.0F, 2.5F, 5.0F)
          horizontalLineToRelative(9.0F)
          curveTo(11.776F, 5.0F, 12.0F, 4.776F, 12.0F, 4.5F)
          reflectiveCurveTo(11.776F, 4.0F, 11.5F, 4.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(5.0F, 7.5F)
          curveTo(5.0F, 7.224F, 5.224F, 7.0F, 5.5F, 7.0F)
          horizontalLineToRelative(6.0F)
          curveTo(11.776F, 7.0F, 12.0F, 7.224F, 12.0F, 7.5F)
          reflectiveCurveTo(11.776F, 8.0F, 11.5F, 8.0F)
          horizontalLineToRelative(-6.0F)
          curveTo(5.224F, 8.0F, 5.0F, 7.776F, 5.0F, 7.5F)
          close()
          moveTo(8.5F, 10.0F)
          curveTo(8.224F, 10.0F, 8.0F, 10.224F, 8.0F, 10.5F)
          reflectiveCurveTo(8.224F, 11.0F, 8.5F, 11.0F)
          horizontalLineToRelative(3.0F)
          curveToRelative(0.276F, 0.0F, 0.5F, -0.224F, 0.5F, -0.5F)
          reflectiveCurveTo(11.776F, 10.0F, 11.5F, 10.0F)
          horizontalLineToRelative(-3.0F)
          close()        
      }
    }
    return _arrowSortDownLines20!!
  }

private var _arrowSortDownLines20: ImageVector? = null
