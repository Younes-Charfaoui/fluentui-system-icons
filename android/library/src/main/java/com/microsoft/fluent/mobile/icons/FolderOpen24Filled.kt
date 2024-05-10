package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.FolderOpen24: ImageVector
  get() {
    if (_folderOpen24 != null) {
      return _folderOpen24!!
    }
    _folderOpen24 = fluentIcon(name = "Filled.FolderOpen24", 24f) {
      materialPath {
          moveTo(5.25F, 3.0F)
          curveTo(3.455F, 3.0F, 2.0F, 4.455F, 2.0F, 6.25F)
          verticalLineToRelative(8.912F)
          lineToRelative(2.045F, -3.541F)
          curveToRelative(0.759F, -1.315F, 2.162F, -2.125F, 3.68F, -2.125F)
          horizontalLineTo(20.0F)
          verticalLineTo(8.75F)
          curveToRelative(0.0F, -1.795F, -1.455F, -3.25F, -3.25F, -3.25F)
          horizontalLineToRelative(-5.19F)
          lineTo(9.72F, 3.659F)
          curveTo(9.298F, 3.237F, 8.725F, 3.0F, 8.129F, 3.0F)
          horizontalLineTo(5.25F)
          close()
          moveToRelative(2.475F, 7.996F)
          horizontalLineToRelative(13.02F)
          curveToRelative(1.732F, 0.0F, 2.814F, 1.875F, 1.948F, 3.375F)
          lineToRelative(-3.036F, 5.258F)
          curveToRelative(-0.491F, 0.851F, -1.4F, 1.375F, -2.382F, 1.375F)
          horizontalLineTo(4.255F)
          curveToRelative(-1.731F, 0.0F, -2.814F, -1.875F, -1.948F, -3.375F)
          lineToRelative(3.037F, -5.258F)
          curveToRelative(0.49F, -0.851F, 1.399F, -1.375F, 2.381F, -1.375F)
          close()        
      }
    }
    return _folderOpen24!!
  }

private var _folderOpen24: ImageVector? = null
