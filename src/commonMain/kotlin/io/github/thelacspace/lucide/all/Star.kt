package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Star") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.525f, 2.295f)
                arcToRelative(.53f, .53f, 0f, false, true, .95f, 0f)
                lineToRelative(2.31f, 4.679f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, 1.595f, 1.16f)
                lineToRelative(5.166f, .756f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, .904f)
                lineToRelative(-3.736f, 3.638f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, -.611f, 1.878f)
                lineToRelative(.882f, 5.14f)
                arcToRelative(.53f, .53f, 0f, false, true, -.771f, .56f)
                lineToRelative(-4.618f, -2.428f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, -1.973f, 0f)
                lineTo(6.396f, 21.01f)
                arcToRelative(.53f, .53f, 0f, false, true, -.77f, -.56f)
                lineToRelative(.881f, -5.139f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, -.611f, -1.879f)
                lineTo(2.16f, 9.795f)
                arcToRelative(.53f, .53f, 0f, false, true, .294f, -.906f)
                lineToRelative(5.165f, -.755f)
                arcToRelative(2.122f, 2.122f, 0f, false, false, 1.597f, -1.16f)
                close()
            }
}

public val LucideIcons.All.StarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Star: ImageVector
    @Composable get() = StarDefinition.asImageVector()
