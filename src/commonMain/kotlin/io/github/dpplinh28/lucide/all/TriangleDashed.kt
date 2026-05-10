package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.17f, 4.193f)
                arcToRelative(2f, 2f, 0f, false, true, 3.666f, .013f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.874f, 7.743f)
                lineToRelative(1f, 1.732f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.849f, 12.952f)
                lineToRelative(1f, 1.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.824f, 18.18f)
                arcToRelative(2f, 2f, 0f, false, true, -1.835f, 2.824f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.024f, 21f)
                arcToRelative(2f, 2f, 0f, false, true, -1.839f, -2.839f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.136f, 12.952f)
                lineToRelative(-1f, 1.732f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 21f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8.102f, 7.743f)
                lineToRelative(-1f, 1.732f)
            }
}

public val LucideIcons.All.TriangleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleDashed: ImageVector
    @Composable get() = TriangleDashedDefinition.asImageVector()
