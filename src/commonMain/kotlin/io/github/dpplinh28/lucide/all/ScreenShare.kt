package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScreenShare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 3f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17f, 8f)
                lineToRelative(5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
            }
}

public val LucideIcons.All.ScreenShareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScreenShare: ImageVector
    @Composable get() = ScreenShareDefinition.asImageVector()
