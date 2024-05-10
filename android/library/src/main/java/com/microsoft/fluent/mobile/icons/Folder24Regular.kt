package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.Folder24: ImageVector
  get() {
    if (_folder24 != null) {
      return _folder24!!
    }
    _folder24 = fluentIcon(name = "Regular.Folder24", 24f) {
      materialPath {
          moveTo(3.5F, 6.25F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(4.629F)
          curveToRelative(0.199F, 0.0F, 0.39F, -0.079F, 0.53F, -0.22F)
          lineToRelative(1.53F, -1.53F)
          lineToRelative(-1.53F, -1.53F)
          curveTo(8.519F, 4.579F, 8.328F, 4.5F, 8.129F, 4.5F)
          horizontalLineTo(5.25F)
          curveTo(4.284F, 4.5F, 3.5F, 5.284F, 3.5F, 6.25F)
          close()
          moveToRelative(-1.5F, 0.0F)
          curveTo(2.0F, 4.455F, 3.455F, 3.0F, 5.25F, 3.0F)
          horizontalLineToRelative(2.879F)
          curveToRelative(0.596F, 0.0F, 1.169F, 0.237F, 1.59F, 0.659F)
          lineTo(11.562F, 5.5F)
          horizontalLineToRelative(7.189F)
          curveTo(20.545F, 5.5F, 22.0F, 6.955F, 22.0F, 8.75F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineTo(5.25F)
          curveTo(3.455F, 21.0F, 2.0F, 19.545F, 2.0F, 17.75F)
          verticalLineTo(6.25F)
          close()
          moveTo(3.5F, 9.5F)
          verticalLineToRelative(8.25F)
          curveToRelative(0.0F, 0.966F, 0.784F, 1.75F, 1.75F, 1.75F)
          horizontalLineToRelative(13.5F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineToRelative(-9.0F)
          curveTo(20.5F, 7.784F, 19.716F, 7.0F, 18.75F, 7.0F)
          horizontalLineToRelative(-7.19F)
          lineTo(9.72F, 8.841F)
          curveTo(9.298F, 9.263F, 8.725F, 9.5F, 8.129F, 9.5F)
          horizontalLineTo(3.5F)
          close()        
      }
    }
    return _folder24!!
  }

private var _folder24: ImageVector? = null
