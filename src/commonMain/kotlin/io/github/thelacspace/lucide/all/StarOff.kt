package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.344f, 4.688f)
                lineToRelative(1.181f, -2.393f)
                arcToRelative(.53f, .53f, 0f, false, true, .95f, 0f)
                lineToRelative(2.31f, 4.679f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, 1.595f, 1.16f)
                lineToRelative(5.166f, .756f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, .904f)
                lineToRelative(-3.237f, 3.152f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(17.945f, 17.945f)
                lineToRelative(.43f, 2.505f)
                arcToRelative(.53f, .53f, 0f, false, true, -.771f, .56f)
                lineToRelative(-4.618f, -2.428f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -1.973f, 0f)
                lineTo(6.396f, 21.01f)
                arcToRelative(.53f, .53f, 0f, false, true, -.77f, -.56f)
                lineToRelative(.881f, -5.139f)
                arcToRelative(2.12f, 2.12f, 0f, false, false, -.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, -.906f)
                lineToRelative(5.165f, -.755f)
                arcToRelative(8f, 8f, 0f, false, false, .4f, -.099f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.StarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarOff: ImageVector
    @Composable get() = StarOffDefinition.asImageVector()
