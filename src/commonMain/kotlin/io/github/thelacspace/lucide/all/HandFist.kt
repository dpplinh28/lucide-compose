package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandFist") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.035f, 17.012f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                lineToRelative(-.311f, -.002f)
                arcToRelative(.72f, .72f, 0f, false, true, -.505f, -1.229f)
                lineToRelative(1.195f, -1.195f)
                arcTo(2f, 2f, 0f, false, true, 10.828f, 11f)
                horizontalLineTo(12f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -4f)
                horizontalLineTo(9.243f)
                arcToRelative(3f, 3f, 0f, false, false, -2.122f, .879f)
                lineToRelative(-2.707f, 2.707f)
                arcTo(4.83f, 4.83f, 0f, false, false, 3f, 14f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, 8f)
                horizontalLineToRelative(2f)
                arcToRelative(8f, 8f, 0f, false, false, 8f, -8f)
                verticalLineTo(7f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.888f, 9.662f)
                arcTo(2f, 2f, 0f, false, false, 17f, 8f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, true, false, 13f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                arcTo(2f, 2f, 0f, true, false, 5f, 5f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 7f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, true, true, 13f, 4f)
                verticalLineTo(7.268f)
            }
}

public val LucideIcons.All.HandFistDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandFist: ImageVector
    @Composable get() = HandFistDefinition.asImageVector()
