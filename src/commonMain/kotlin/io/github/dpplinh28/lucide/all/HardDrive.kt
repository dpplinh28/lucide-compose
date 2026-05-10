package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardDrive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 16f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.212f, 11.577f)
                arcToRelative(2f, 2f, 0f, false, false, -.212f, .896f)
                verticalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-5.527f)
                arcToRelative(2f, 2f, 0f, false, false, -.212f, -.896f)
                lineTo(18.55f, 5.11f)
                arcTo(2f, 2f, 0f, false, false, 16.76f, 4f)
                horizontalLineTo(7.24f)
                arcToRelative(2f, 2f, 0f, false, false, -1.79f, 1.11f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.946f, 12.013f)
                horizontalLineTo(2.054f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 16f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.HardDriveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardDrive: ImageVector
    @Composable get() = HardDriveDefinition.asImageVector()
