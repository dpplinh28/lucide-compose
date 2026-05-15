package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.828f, 13.07f)
                arcTo(3f, 3f, 0f, false, true, 12f, 8.764f)
                arcToRelative(3f, 3f, 0f, false, true, 4.172f, 4.306f)
                lineToRelative(-3.447f, 3.62f)
                arcToRelative(1f, 1f, 0f, false, true, -1.449f, 0f)
                close()
            }
}

public val LucideIcons.All.ScanHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanHeart: ImageVector
    @Composable get() = ScanHeartDefinition.asImageVector()
