package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nut") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 10f)
                verticalLineToRelative(4f)
                arcToRelative(7.004f, 7.004f, 0f, false, false, 5.277f, 6.787f)
                curveToRelative(.412f, .104f, .802f, .292f, 1.102f, .592f)
                lineTo(12f, 22f)
                lineToRelative(.621f, -.621f)
                curveToRelative(.3f, -.3f, .69f, -.488f, 1.102f, -.592f)
                arcTo(7.003f, 7.003f, 0f, false, false, 19f, 14f)
                verticalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 4f)
                curveTo(8f, 4f, 4.5f, 6f, 4f, 8f)
                curveToRelative(-.243f, .97f, -.919f, 1.952f, -2f, 3f)
                curveToRelative(1.31f, -.082f, 1.972f, -.29f, 3f, -1f)
                curveToRelative(.54f, .92f, .982f, 1.356f, 2f, 2f)
                curveToRelative(1.452f, -.647f, 1.954f, -1.098f, 2.5f, -2f)
                curveToRelative(.595f, .995f, 1.151f, 1.427f, 2.5f, 2f)
                curveToRelative(1.31f, -.621f, 1.862f, -1.058f, 2.5f, -2f)
                curveToRelative(.629f, .977f, 1.162f, 1.423f, 2.5f, 2f)
                curveToRelative(1.209f, -.548f, 1.68f, -.967f, 2f, -2f)
                curveToRelative(1.032f, .916f, 1.683f, 1.157f, 3f, 1f)
                curveToRelative(-1.297f, -1.036f, -1.758f, -2.03f, -2f, -3f)
                curveToRelative(-.5f, -2f, -4f, -4f, -8f, -4f)
                close()
            }
}

public val LucideIcons.All.NutDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nut: ImageVector
    @Composable get() = NutDefinition.asImageVector()
