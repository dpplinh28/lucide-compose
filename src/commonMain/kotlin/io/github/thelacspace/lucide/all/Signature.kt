package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Signature") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(21f, 17f)
                lineToRelative(-2.156f, -1.868f)
                arcTo(.5f, .5f, 0f, false, false, 18f, 15.5f)
                verticalLineToRelative(.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                curveToRelative(0f, -2.545f, -3.991f, -3.97f, -8.5f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 5f)
                curveToRelative(4.153f, 0f, 4.745f, -11.295f, 5.708f, -13.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 3.31f, 3.284f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 21f)
                horizontalLineToRelative(18f)
            }
}

public val LucideIcons.All.SignatureDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Signature: ImageVector
    @Composable get() = SignatureDefinition.asImageVector()
