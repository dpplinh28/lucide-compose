package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.93f, 4.93f)
                lineToRelative(1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 12f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19.07f, 4.93f)
                lineToRelative(-1.41f, 1.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.947f, 12.65f)
                arcToRelative(4f, 4f, 0f, false, false, -5.925f, -4.128f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 22f)
                horizontalLineTo(7f)
                arcToRelative(5f, 5f, 0f, true, true, 4.9f, -6f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                close()
            }
}

public val LucideIcons.All.CloudSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSun: ImageVector
    @Composable get() = CloudSunDefinition.asImageVector()
